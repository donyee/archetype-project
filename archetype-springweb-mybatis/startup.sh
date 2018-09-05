#!/usr/bin/env bash
# 所有jar 都在libs 目录
# 配置文件在 config 目录
java -Dloader.path=file:./libs -Dfile.encoding=UTF-8 -jar ./libs/buspay-gate-1.0.jar &
