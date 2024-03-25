#!/bin/sh

Get-ChildItem -Path .\src -Filter *.java -Recurse | ForEach-Object {
    java -jar google-java-format-1.18.1-all-deps.jar --replace $_.FullName
}