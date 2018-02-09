/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/reportportal/commons-dao
 * 
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.epam.ta.reportportal.database.entity.project;

import java.util.function.Predicate;

import static java.util.stream.StreamSupport.stream;

/**
 * Project related utility methods
 * 
 * @author Andrei_Ramanchuk
 *
 */
public class ProjectUtils {
	private static final String INIT_FROM = "reportportal@example.com";
	private static final String OWNER = "OWNER";

	private ProjectUtils() {

	}

//	/**
//	 * Setup default project email configuration
//	 *
//	 * @param project
//	 * @return project object with default email config
//	 */
//	public static Project setDefaultEmailCofiguration(Project project) {
//		EmailSenderCase defaultOne = new EmailSenderCase(Lists.newArrayList(OWNER), SendCase.ALWAYS.name(), Lists.newArrayList(),
//				Lists.newArrayList());
//		ProjectEmailConfig config = new ProjectEmailConfig(false, INIT_FROM, Lists.newArrayList(defaultOne));
//		project.getConfiguration().setEmailConfig(config);
//		return project;
//	}
//
//	/**
//	 * Exclude specified project recipients
//	 *
//	 * @param users
//	 * @param project
//	 * @return
//	 */
//	public static Project excludeProjectRecipients(Iterable<User> users, Project project) {
//		if (users != null) {
//			Set<String> toExclude = stream(users.spliterator(), false)
//					.map(user -> asList(user.getEmail().toLowerCase(), user.getLogin().toLowerCase())).flatMap(List::stream)
//					.collect(toSet());
//			/* Current recipients of specified project */
//			List<EmailSenderCase> cases = project.getConfiguration().getEmailConfig().getEmailCases();
//			if (null != cases) {
//				cases.stream().forEach(c -> {
//					// saved - list of saved user emails before changes
//					List<String> saved = c.getRecipients();
//					c.setRecipients(saved.stream().filter(it -> !toExclude.contains(it.toLowerCase())).collect(toList()));
//				});
//				project.getConfiguration().getEmailConfig().setEmailCases(cases);
//			}
//		}
//		return project;
//	}
//
//	/**
//	 * Update specified project recipient
//	 *
//	 * @param oldEmail
//	 * @param newEmail
//	 * @param project
//	 * @return
//	 */
//	public static Project updateProjectRecipients(String oldEmail, String newEmail, Project project) {
//		List<EmailSenderCase> cases = project.getConfiguration().getEmailConfig().getEmailCases();
//		if ((null != cases) && (null != oldEmail) && (null != newEmail)) {
//			cases.stream().forEach(c -> {
//				List<String> saved = c.getRecipients();
//				if (saved.stream().anyMatch(email -> email.equalsIgnoreCase(oldEmail))) {
//					c.setRecipients(saved.stream().filter(processRecipientsEmails(Lists.newArrayList(oldEmail))).collect(toList()));
//					c.getRecipients().add(newEmail);
//				}
//			});
//			project.getConfiguration().getEmailConfig().setEmailCases(cases);
//		}
//		return project;
//	}
//
//	/**
//	 * Checks if the user is assigned on project
//	 *
//	 * @param project Specified project
//	 * @param user    User login
//	 * @return        True, if exists
//	 */
//	public static boolean doesHaveUser(Project project, String user) {
//		return project.getUsers().stream().anyMatch(it ->
//				user.equals(it.getLogin()));
//	}
//
//	/**
//	 * Finds UserConfig for specified login. Returns null
//	 * if it doesn't exists.
//	 *
//	 * @param user Login for search
//	 * @return     UserConfig for specified login
//	 */
//	@Nullable
//	public static Project.UserConfig findUserConfigByLogin(Project project, String user) {
//		return project.getUsers().stream().filter(it -> user.equals(it.getLogin())).findAny()
//				.orElse(null);
//	}

	private static Predicate<String> processRecipientsEmails(final Iterable<String> emails) {
		return input -> stream(emails.spliterator(), false).noneMatch(email -> email.equalsIgnoreCase(input));
	}

	public static String getOwner() {
		return OWNER;
	}
}