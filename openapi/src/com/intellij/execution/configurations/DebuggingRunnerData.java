/*
 * Copyright (c) 2000-2004 by JetBrains s.r.o. All Rights Reserved.
 * Use is subject to license terms.
 */
package com.intellij.execution.configurations;

public interface DebuggingRunnerData {
  /**
   * @return a string denoting debug port. In case of socket transport this is a number, in case of shared memory transport this is a string
   */
  String getDebugPort();
  
  boolean isRemote();
}
