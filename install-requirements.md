#!/usr/bin/env bash


# Install [slackcat](https://github.com/rlister/slackcat)

```shell 
    gem install slackcat
    export SLACK_TOKEN=<your api token>
```

# Install jira-cli 

follow instructions [here](https://jira-cli.readthedocs.org/en/latest/index.html)

sudo pip install jira-cli

# configure jira-cli with your credentials

```shell
    jira-cli configure
    Base url for the jira instance: http://my.jira.net
    username: johndoe
    password: *******
    would you like to persist the credentials to ~/.jira_cli/config.cfg?
    [WARNING: this will store credentials in plaintext [y/n]:y
``` 