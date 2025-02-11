// SPDX-License-Identifier: Apache-2.0
package io.github.stavshamir.springwolf.configuration.properties;

import static io.github.stavshamir.springwolf.configuration.properties.SpringwolfConfigConstants.ENABLED;
import static io.github.stavshamir.springwolf.configuration.properties.SpringwolfConfigConstants.SCANNER;
import static io.github.stavshamir.springwolf.configuration.properties.SpringwolfConfigConstants.SPRINGWOLF_PLUGIN_CONFIG_PREFIX;

public class SpringwolfJmsConfigConstants {

    public static final String SPRINGWOLF_JMS_CONFIG_PREFIX = SPRINGWOLF_PLUGIN_CONFIG_PREFIX + ".jms";

    public static final String SPRINGWOLF_JMS_PLUGIN_PUBLISHING_ENABLED = "publishing.enabled";

    public static final String SPRINGWOLF_SCANNER_JMS_LISTENER_ENABLED =
            SPRINGWOLF_JMS_CONFIG_PREFIX + SCANNER + ".jms-listener" + ENABLED;
}
