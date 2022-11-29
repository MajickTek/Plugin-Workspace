# Plugin-Workspace
 Plugin loader/api/utilities for Java

This repo contains an eclipse workspace which contains an api for implementing a plugin system in any application.

Ideally you use the plugin loader api in your game or app, while the players just have to import the plugin interface without needing to interact with the game code at all.

A plugin may use a reflection-based API to directly access the game/app (TBD)

Documentation and a full example API/plugin combo are TBD

## TODO
* JavaDoc
* API hooks for logging instead of using System.out/System.err


## CREDITS

https://github.com/Jerady/addon-commons for the base serviceloader code

https://java-design-patterns.com/ for some neat programming tricks such as the Converter pattern which is a fundamental part of how my plugin api is meant to work