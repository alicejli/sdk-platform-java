/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.pubsub.v1.samples;

// [START pubsub_v1_generated_topicadminclient_createtopic_string_sync]
import com.google.cloud.pubsub.v1.TopicAdminClient;
import com.google.pubsub.v1.Topic;
import com.google.pubsub.v1.TopicName;

public class SyncCreateTopicString {

  public static void main(String[] args) throws Exception {
    syncCreateTopicString();
  }

  public static void syncCreateTopicString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
      String name = TopicName.ofProjectTopicName("[PROJECT]", "[TOPIC]").toString();
      Topic response = topicAdminClient.createTopic(name);
    }
  }
}
// [END pubsub_v1_generated_topicadminclient_createtopic_string_sync]