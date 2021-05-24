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

package net.rithms.riot.api.endpoints.summoner.methods;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.endpoints.summoner.SummonerApiMethod;
import net.rithms.riot.api.endpoints.summoner.dto.Summoner;
import net.rithms.riot.constant.Platform;

public class GetSummonerByName extends SummonerApiMethod {

	public GetSummonerByName(ApiConfig config, Platform platform, String summonerName) {
		super(config);
		setPlatform(platform);
		setReturnType(Summoner.class);
		try {
			setUrlBase(platform.getHost() + "/lol/summoner/v4/summoners/by-name/" + URLEncoder.encode(summonerName, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// This should never happen
			RiotApi.log.error("URL Encoding Failed", e);
		}
		addApiKeyParameter();
	}
}