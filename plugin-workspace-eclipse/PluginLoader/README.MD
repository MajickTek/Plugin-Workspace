# PluginLoader

This is the base, minimal plugin-loading api. It contains classes for loading plugins using a `ServiceLoader` inside an app's own jar or from external jars.

An app implementing this loader must provide the entire plugin API, the default API blueprint (`Plugin` interface) is empty.

Classes are/will be provided for convienience such as implementing a registry (e.g. for game items) and convewrting between API/raw game types. 

Future versions may allow easy exposure of game/app fields, methods, and classes via reflection
