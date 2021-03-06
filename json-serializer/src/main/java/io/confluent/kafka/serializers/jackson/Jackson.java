/*
 * Copyright 2020 Confluent Inc.
 *
 * Licensed under the Confluent Community License (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 *
 * http://www.confluent.io/confluent-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.confluent.kafka.serializers.jackson;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;

/**
 * A utility class for Jackson.
 */
public class Jackson {
  private Jackson() {
    /* singleton */
  }

  /**
   * Creates a new {@link ObjectMapper}.
   */
  public static ObjectMapper newObjectMapper() {
    final ObjectMapper mapper = new ObjectMapper();

    return configure(mapper);
  }

  /**
   * Creates a new {@link ObjectMapper} with a custom
   * {@link JsonFactory}.
   *
   * @param jsonFactory instance of {@link JsonFactory} to use
   *     for the created {@link ObjectMapper} instance.
   */
  public static ObjectMapper newObjectMapper(JsonFactory jsonFactory) {
    final ObjectMapper mapper = new ObjectMapper(jsonFactory);

    return configure(mapper);
  }

  private static ObjectMapper configure(ObjectMapper mapper) {
    mapper.registerModule(new ParameterNamesModule());
    mapper.registerModule(new Jdk8Module());
    mapper.registerModule(new JavaTimeModule());

    return mapper;
  }
}
