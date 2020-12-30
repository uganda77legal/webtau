/*
 * Copyright 2020 webtau maintainers
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.testingisdocumenting.webtau.version;

import org.testingisdocumenting.webtau.console.ConsoleOutputs;
import org.testingisdocumenting.webtau.console.ansi.Color;
import org.testingisdocumenting.webtau.utils.ResourceUtils;

public class WebtauVersion {
    private static final String version;
    private static final String timeStamp;

    static {
        String[] versionTimeStamp = ResourceUtils.textContent("webtau-version.txt").trim().split(" ");
        version = versionTimeStamp[0];
        timeStamp = versionTimeStamp[1];
    }

    private WebtauVersion() {
    }

    public static String getVersion() {
        return version;
    }

    public static String getTimeStamp() {
        return timeStamp;
    }

    public static void print() {
        ConsoleOutputs.out(Color.YELLOW, "webtau version: ", Color.CYAN, WebtauVersion.getVersion(),
                Color.GREEN, " (", WebtauVersion.getTimeStamp(), ")");
    }
}
