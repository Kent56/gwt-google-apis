/*
 * Copyright 2007 Google Inc.
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
package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.jsio.client.JSFlyweightWrapper;
import com.google.gwt.jsio.client.JSList;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.overlay.Marker;
import com.google.gwt.maps.client.overlay.MarkerManagerOptions;

public interface MarkerManagerImpl extends JSFlyweightWrapper {

  public static final MarkerManagerImpl impl = (MarkerManagerImpl) GWT.create(MarkerManagerImpl.class);

  /**
   * @gwt.constructor $wnd.GMarkerManager
   */
  public JavaScriptObject construct(MapWidget map);

  /**
   * @gwt.constructor $wnd.GMarkerManager
   */
  public JavaScriptObject construct(MapWidget map, MarkerManagerOptions options);

  public void addMarkers(JavaScriptObject jsoPeer,
      JSList /* Marker[] */markers, int minZoom, int maxZoom);

  public void addMarkers(JavaScriptObject jsoPeer,
      JSList /* Marker[] */markers, int minZoom);

  public void addMarker(JavaScriptObject jsoPeer, Marker marker, int minZoom,
      int maxZoom);

  public void addMarker(JavaScriptObject jsoPeer, Marker marker, int minZoom);

  public void refresh(JavaScriptObject jsoPeer);

  public int getMarkerCount(JavaScriptObject jsoPeer, int zoomLevel);
}