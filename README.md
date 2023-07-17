# Global converter


# Purpose

The project consists of a Java application that allows for the conversion of strings between different numeral bases (binary, hexadecimal, octal, decimal), 
as well as the conversion of a numeric string into a textual representation.

# Usage

*Get Started*

```
cd global_converter
javac GlobalConverter.java
```

*Examples*

Convert text to hexadecimal representation:

```
java GlobalConverter hexadecimal "hello world"
```
Output:

The result of the conversion is: <br>
68 65 6C 6C 6F 20 77 6F 72 6C 64

Other possible bases (instead of **hexadecimal**): **decimal (ascii)**, **binary** and **octal**

Convert hexadecimal type to text:

```
java GlobalConverter text "hex 68 65 6C 6C 6F 20 77 6F 72 6C 64"

```
Output:

The result of the conversion is:
hello world

Other possible bases (instead of **hex**): **dec**, **bin** and **oct**










