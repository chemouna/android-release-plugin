package com.mounacheikhna.release

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task

/**
 * Created by m.cheikhna on 24/03/2016.
 */
class ReleasePlugin implements Plugin<Project> {

    private static final String RELEASE_GROUP = "release-process"

    @Override
    void apply(Project project) {

        project.extensions.add("releaseProcess", ReleaseProcessExtension)

        project.afterEvaluate {

        }

    }
}
