/**
 * Copyright 2012. The Regents of the University of California (Regents).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package path_inference.manager

import edu.berkeley.path.bots.core.MMLogging
import edu.berkeley.path.bots.netconfig.Datum.ProbeCoordinate
import edu.berkeley.path.bots.netconfig.Link

trait HiredFilter extends PathInferenceManager with MMLogging {
  override def addPoint(point:ProbeCoordinate[Link]): Unit = {
    if (point.hired != null && point.hired.booleanValue() == true) {
      } else {
      super.addPoint(point)
    }
  }
}

