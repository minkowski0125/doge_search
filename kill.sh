#!/bin/sh
ps -ef | grep doge-search-1.0 | awk '{print $2}' | xargs kill -9