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

package org.testingisdocumenting.webtau.graphql;

import org.testingisdocumenting.webtau.cfg.ConfigValue;
import org.testingisdocumenting.webtau.cfg.WebTauConfig;
import org.testingisdocumenting.webtau.cfg.WebTauConfigHandler;

import java.util.stream.Stream;

import static org.testingisdocumenting.webtau.cfg.ConfigValue.declare;

public class GraphQLConfig implements WebTauConfigHandler {
    static final ConfigValue ignoreIntrospectionFailures = declare(
            "graphQLIgnoreIntrospectionFailures",
            "ignore graphQL introspection failures, introspection is required for coverage reporting",
            () -> true);

    public static boolean ignoreIntrospectionFailures() {
        return ignoreIntrospectionFailures.getAsBoolean();
    }

    @Override
    public void onAfterCreate(WebTauConfig cfg) {
        GraphQL.reset();
    }

    @Override
    public Stream<ConfigValue> additionalConfigValues() {
        return Stream.of(ignoreIntrospectionFailures);
    }
}
