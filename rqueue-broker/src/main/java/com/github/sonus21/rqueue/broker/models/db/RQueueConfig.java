/*
 * Copyright 2020 Sonu Kumar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.sonus21.rqueue.broker.models.db;

import com.github.sonus21.rqueue.models.SerializableBase;
import java.util.Map;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class RQueueConfig extends SerializableBase {
  private static final long serialVersionUID = -7377265707903362101L;
  private String id;
  private String name;
  private String simpleQueuePrefix;
  private String delayedQueuePrefix;
  private String processingQueuePrefix;
  private Long visibilityTimeout;
  private Map<String, Integer> priority;
  private Boolean defaultQueue;
  private long createdOn;
  private long updatedOn;
  private boolean deleted;
  private Long deletedOn;
}