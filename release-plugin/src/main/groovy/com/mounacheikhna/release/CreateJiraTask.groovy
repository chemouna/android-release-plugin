package com.mounacheikhna.release

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Exec
import org.gradle.api.tasks.TaskAction

/**
 * Created by m.cheikhna on 22/03/2016.
 */
class CreateJiraTask extends DefaultTask implements JiraSpec {

    private String project
    private String title
    private String description

    @TaskAction
    void performTask() {
        def args = ['jira-cli', 'new', '--type=Development New Feature', '--priority=Major', '--project', project,
                    title, '--description', description]

        project.task("runCreateJira", type: Exec) {
            commandLine args
        }.execute()
    }

    @Override
    void project(String project) {
        this.project = project
    }

    @Override
    void title(String title) {
        this.title = title
    }

    @Override
    void description(String description) {
        this.description = description
    }
}
