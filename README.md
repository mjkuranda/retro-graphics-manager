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
Lists all files that contains specific folder.
You can list `input` or `output` directory content.
To list all files from output directory, you need to type: `list out` or `ls out`.

### `generate`/`gen` command
```
generate light|dark block|rectangle [scale] [name]
gen light|dark block|rectangle [scale] [name]
```
To generate light, block palette with default name, type one of them:
```
generate light block
gen light block
```
To generate dark, rectangle palette with `my-palette` name, type one of them:
```
generate dark rectangle my-palette
gen dark rectangle my-palette
```
To generate light, block palette, and 5 as scale parameter, type one of them:
```
generate light block 5
gen light block 5
```
To generate dark, block palette, 4 as scale parameter and `my-palette` name, type one of them:
```
generate dark block 4 my-palette
gen dark block 4 my-palette
```

### `exit`/`end`/`terminate`|`term` command
```
exit
terminate
term
```
One of the upper commands exits the program.