/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.gadgets.rebind;

import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.typeinfo.JClassType;
import com.google.gwt.core.ext.typeinfo.JMethod;
import com.google.gwt.user.rebind.SourceWriter;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Pluggable support for new Preference types.
 */
public interface PreferenceGenerator {
  /**
   * Called by {@link UserPreferencesGenerator} to configure the Preference's
   * element within the Gadget manifest.
   */
  void configurePreferenceElement(TreeLogger logger, Document d,
      Element userPref, JClassType preferenceType, JMethod m)
      throws UnableToCompleteException;

  /**
   * Called by {@link GadgetGenerator} to have an instantiation of the
   * Preference instance written into a SourceWriter.
   */
  void writeInstantiation(TreeLogger logger, SourceWriter sw,
      JClassType extendsPreferenceType, JMethod prefMethod)
      throws UnableToCompleteException;
}
