# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [3.4.0] - 2023-05-20
### Added
- [@mjkuranda](https://github.com/mjkuranda): Option `dirType` to `ListCommand`.

## [3.3.0] - 2023-05-20
### Added
- [@mjkuranda](https://github.com/mjkuranda): `generate`/`gen` command to generate light or bright palettes with a specific name but scale 1.

## [3.2.0] - 2023-05-20
### Added
- [@mjkuranda](https://github.com/mjkuranda): Command parsers that create final command object.
- [@mjkuranda](https://github.com/mjkuranda): CommandCreator handles creating command objects and catches errors.
- [@mjkuranda](https://github.com/mjkuranda): RetroGraphicsManager exceptions.

### Changed
- [@mjkuranda](https://github.com/mjkuranda): Main program loop execution.

### Removed
- [@mjkuranda](https://github.com/mjkuranda): `isValid` method of command interface. The parsers are handling processing now.
- [@mjkuranda](https://github.com/mjkuranda): CommandFactory.

## [3.1.0] - 2023-05-17
### Added
- [@mjkuranda](https://github.com/mjkuranda): Unknown command to implement `Null object design pattern`.
- [@mjkuranda](https://github.com/mjkuranda): Application class based on singleton design pattern.

### Changed
- [@mjkuranda](https://github.com/mjkuranda): Command to interface instead of abstract class.

## [3.0.0] - 2023-05-11
### Added
- [@mjkuranda](https://github.com/mjkuranda): Command system.
- [@mjkuranda](https://github.com/mjkuranda): `ls` or `list` command.
- [@mjkuranda](https://github.com/mjkuranda): `exit`, `end`, `terminate` or `term` command.

### Changed
- [@mjkuranda](https://github.com/mjkuranda): More significant role for a `RetroGraphicsManager` class.

### Removed:
- [@mjkuranda](https://github.com/mjkuranda): Static generating palettes and converting images.

## [2.3.0] - 2023-05-10
### Added
- [@mjkuranda](https://github.com/mjkuranda): Factory for creating palettes.

## [2.2.0] - 2023-05-10
### Added
- [@mjkuranda](https://github.com/mjkuranda): Abstraction for Palette objects.

### Changed
- [@mjkuranda](https://github.com/mjkuranda): RetroGraphicsManager handles all actions instead of com.github.mjkuranda.retrographicsmanager.Main class.
- [@mjkuranda](https://github.com/mjkuranda): PaletteWriter simplified.

### Removed
- [@mjkuranda](https://github.com/mjkuranda): PaletteGenerator.

## [2.1.0] - 2023-05-08
### Changed
- [@mjkuranda](https://github.com/mjkuranda): New color converting system.
- [@mjkuranda](https://github.com/mjkuranda): Documentation for converters and `PaletteColor`.

## [2.0.0] - 2023-05-08
### Added
- [@mjkuranda](https://github.com/mjkuranda): Permitting on conversion for images in `input` directory.
- [@mjkuranda](https://github.com/mjkuranda): ImageConverter converts images.
- [@mjkuranda](https://github.com/mjkuranda): Color index to color and color to its index in the palette.

### Changed
- [@mjkuranda](https://github.com/mjkuranda): Project name to `Retro Graphics Manager`.
- [@mjkuranda](https://github.com/mjkuranda): Project divided into two modules: `Palette Generator` and `Image Converter`.

## [1.1.0] - 2023-04-26
### Added
- [@mjkuranda](https://github.com/mjkuranda): Basic PaletteGenerator for darker and brighter palette.
- [@mjkuranda](https://github.com/mjkuranda): Scalable palette image results.
- [@mjkuranda](https://github.com/mjkuranda): PaletteWriter and Palette classes.
- [@mjkuranda](https://github.com/mjkuranda): Palette block and rectangle types.

## [1.0.0] - 2023-04-25
### Added
- [@mjkuranda](https://github.com/mjkuranda): Initial release.