/*
 * Copyright 2017 github.com/kaaz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package emily.guildsettings.music;

import emily.guildsettings.AbstractGuildSetting;
import emily.guildsettings.types.BooleanSettingType;


public class SettingMusicClearAdminOnly extends AbstractGuildSetting<BooleanSettingType> {
    @Override
    protected BooleanSettingType getSettingsType() {
        return new BooleanSettingType();
    }

    @Override
    public String getKey() {
        return "music_clear_admin_only";
    }

    @Override
    public String[] getTags() {
        return new String[]{"music", "admin", "clear"};
    }

    @Override
    public String getDefault() {
        return "true";
    }

    @Override
    public String[] getDescription() {
        return new String[]{"Only allow admins to clear the music add?",
                "",
                "true",
                "Only admins can clear the music add",
                "",
                "false",
                "Everyone can clear the add",
        };
    }
}
