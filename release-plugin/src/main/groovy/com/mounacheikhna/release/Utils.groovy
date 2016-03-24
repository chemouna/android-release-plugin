package com.mounacheikhna.release

import org.gradle.api.Task

/**
 * Created by m.cheikhna on 24/03/2016.
 */
class Utils {

    static void dependsOnOrdered(Task task, Task... others) {
        task.dependsOn(others)
        for (int i = 0; i < others.size() - 1; i++) {
            if (others[i] != null) {
                others[i + 1].mustRunAfter(others[i])
            }
        }
    }

}
