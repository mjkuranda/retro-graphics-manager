# Retro Graphics Manager
This console application is divided into three modules:
* Palette generator for 8 bit palette
* Image and color converters
* Command system to execute upper actions

## Commands
Following commands are available:

### `list`/`ls` command
```
list in|out
ls in|out
```
Lists all files that are located in a specific folder.
You can list `input` or `output` directory content.
To list all files from output directory, you need to type: `list out` or `ls out`.

### `generate`/`gen` command
```
generate light|dark block|rectangle [scale] [name]
gen light|dark block|rectangle [scale] [name]
```
Generates 8-bit palette.
To generate light, block palette with default name, type one of the following command:
```
generate light block
gen light block
```
To generate dark, rectangle palette with `my-palette` name, type one of the following command:
```
generate dark rectangle my-palette
gen dark rectangle my-palette
```
To generate light, block palette, and 5 as scale parameter, type one of the following command:
```
generate light block 5
gen light block 5
```
To generate dark, block palette, 4 as scale parameter and `my-palette` name, type one of the following command:
```
generate dark block 4 my-palette
gen dark block 4 my-palette
```

### `convert`/`conv` command
```
convert light|dark {fileName} [convertedFileName]
conv light|dark {fileName} [convertedFileName]
```
Converts any image file to 8-bit image.
To convert `myimage.png` to `convmyimage.png` using light palette, type one of them:
```
convert light myimage.png convmyimage.png
conv light myimage.png convmyimage.png
```
You don't have to specify an image name. To convert `myimage.png` using dark palette, so you don't want to give any name, type one of the following command:
```
convert dark myimage.png
conv dark myimage.png
```

### `exit`/`end`/`terminate`/`term` command
```
exit
terminate
term
```
One of the upper commands exits the program.