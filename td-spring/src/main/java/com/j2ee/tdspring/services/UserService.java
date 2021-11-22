package com.j2ee.tdspring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;

import com.j2ee.tdspring.entities.User;
import com.j2ee.tdspring.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	@Lazy
	private PasswordEncoder passwordEncoder;

	public User createOrUpdate(User user) {
		if (StringUtils.isNoneEmpty(user.getPassword())) {
			user.setPassword(passwordEncoder.encode(user.getPassword()));
		}
		return userRepository.save(user);
	}

	public User getUserById(String username) {
		return userRepository.findById(username).orElse(null);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public void deleteUser(User user) {
		userRepository.delete(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = getUserById(username);
		if (user != null) {
			List<GrantedAuthority> authorities = new ArrayList<>();
			authorities.add(new SimpleGrantedAuthority("ROLE_" + user.getRole()));
			return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
		}
		throw new UsernameNotFoundException("User '" + username + "' not found or inactive");
	}

	public void setPassword(String userName, String newPassword) {
		User user = this.getUserById(userName);
		if (user != null) {
			String encodedNewPassword = passwordEncoder.encode(newPassword);
			user.setPassword(encodedNewPassword);
			userRepository.save(user);
		}
	}
}
