# Visor addon template (Forge)
It is a Visor addon template to start from

## Start Option I: From this template

1. Change the values in `Mod` block of `gradle.properties`
2. Rename the `your.mod.template` package everywhere
3. Apply Minecraft version you need: `gradlew useMinecraft-1.21.1` (All available versions: `gradlew tasks --group minecraft`)

Once you finished with that you can remove no longer needed stuff:
- Delete the `versions` folder
- Delete `gradle/minecraft.gradle`
- Open `build.gradle` and remove this block: `apply from: "gradle/minecraft.gradle"`
- Delete or rewrite README.md

## Start Option II: Add Visor to your own project

1. Copy these to your project dependencies: `versions/<your Minecraft version>.properties`
2. Copy from `build.gradle` the Modrinth repository and `visor` dependencies, from `META-INF/mods.toml` the
   `visor` dependency
3. Register the addon in your `@Mod` constructor, as `TemplateMod` does
