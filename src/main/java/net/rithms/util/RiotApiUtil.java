/*
 * Copyright 2016 Taylor Caldwell
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.rithms.util;

import java.util.Objects;

import net.rithms.riot.api.RiotApi;

public final class RiotApiUtil {

	/**
	 * Returns a new String composed of copies of the {@code elements} joined together with a copy of the specified {@code delimiter}.
	 *
	 * Note that if an element is null, then {@code "null"} is added.
	 *
	 * @param delimiter
	 *            the delimiter that separates each element
	 * @param elements
	 *            the elements to join together
	 * @return a new {@code String} that is composed of the {@code elements} separated by the {@code delimiter}
	 * @throws NullPointerException
	 *             If {@code delimiter} or {@code elements} is {@code null}
	 */
	public static String joinString(CharSequence delimiter, Object... elements) {
		Objects.requireNonNull(delimiter);
		Objects.requireNonNull(elements);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < elements.length - 1; i++) {
			sb.append(elements[i]).append(delimiter);
		}
		sb.append(elements[elements.length - 1]);
		return sb.toString();
	}

	/**
	 * Returns a new String composed of copies of the {@code elements} joined together with a copy of the specified {@code delimiter}.
	 *
	 * Note that if an element is null, then {@code "null"} is added.
	 *
	 * @param delimiter
	 *            the delimiter that separates each element
	 * @param elements
	 *            the elements to join together
	 * @return a new {@code String} that is composed of the {@code elements} separated by the {@code delimiter}
	 * @throws NullPointerException
	 *             If {@code delimiter} or {@code elements} is {@code null}
	 */
	public static String joinString(CharSequence delimiter, CharSequence... elements) {
		return joinString(delimiter, (Object[]) elements);
	}

	/**
	 * Checks that the specified String is not an invalid summoner name. This method is designed primarily to be called by the
	 * {@link RiotApi} to check the validity of a summoner name before firing a request to the Riot Api.
	 * 
	 * @param summonerName
	 *            The summoner name to to check for validity
	 * @throws IllegalArgumentException
	 *             If {@code summonerName} is not valid
	 * @return {@code summonerName} if not invalid
	 */
	public static String requireValidSummonerName(String summonerName) throws IllegalArgumentException {
		// TODO This is only filtering out empty Strings right now. Need proper validity check
		if (summonerName.trim().isEmpty()) {
			throw new IllegalArgumentException("Invalid summoner name \"" + summonerName + "\"");
		}
		return summonerName;
	}
}