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

package net.rithms.riot.api.endpoints.static_data.methods;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.UrlParameter;
import net.rithms.riot.api.endpoints.static_data.StaticDataApiMethod;
import net.rithms.riot.api.endpoints.static_data.constant.Locale;
import net.rithms.riot.api.endpoints.static_data.constant.MasteryListTags;
import net.rithms.riot.api.endpoints.static_data.dto.MasteryList;
import net.rithms.riot.constant.Platform;

public class GetDataMasteryList extends StaticDataApiMethod {

	public GetDataMasteryList(ApiConfig config, Platform platform, Locale locale, String version, MasteryListTags... tags) {
		super(config);
		setPlatform(platform);
		setReturnType(MasteryList.class);
		setUrlBase(platform.getHost() + "/lol/static-data/v3/masteries");
		if (locale != null) {
			add(new UrlParameter("locale", locale));
		}
		if (version != null) {
			add(new UrlParameter("version", version));
		}
		if (tags != null) {
			for (MasteryListTags tag : tags) {
				add(new UrlParameter("tags", tag));
			}
		}
		addApiKeyParameter();
	}
}