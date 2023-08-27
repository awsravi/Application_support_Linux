						sed
`sed` (stream editor) is a powerful command-line tool in Unix and Unix-like operating systems for text manipulation. It is often used for tasks such as search, find and replace, text transformation, and more. Here are some common `sed` commands and their explanations:

1. *Substitute (s):*
   - `sed 's/old_pattern/new_pattern/' filename`: Replace the first occurrence of `old_pattern` with `new_pattern` in the given file.
   - `sed 's/old_pattern/new_pattern/g' filename`: Replace all occurrences of `old_pattern` with `new_pattern` in the given file.

2. *Print (p):*
   - `sed -n '2p' filename`: Print the second line of the file.
   - `sed -n '2,4p' filename`: Print lines 2 to 4 of the file.

3. *Delete (d):*
   - `sed '3d' filename`: Delete the third line of the file.
   - `sed '2,4d' filename`: Delete lines 2 to 4 of the file.

4. *Insert (i) and Append (a):*
   - `sed '2i\inserted_text' filename`: Insert `inserted_text` before the second line.
   - `sed '2a\appended_text' filename`: Append `appended_text` after the second line.

5. *Replace Lines (c):*
   - `sed '2c\new_text' filename`: Replace the second line with `new_text`.

6. *Regular Expressions:*
   - `sed '/pattern/d' filename`: Delete all lines containing `pattern`.
   - `sed '/pattern/s/old/new/' filename`: Replace `old` with `new` on lines containing `pattern`.

7. *Multiple Commands:*
   - You can use `sed` to apply multiple commands by separating them with semicolons. For example, `sed 's/old/new/;s/foo/bar/' filename` would replace `old` with `new` and `foo` with `bar` in the file.

8. *In-Place Editing:*
   - `sed -i 's/old/new/' filename`: Edit the file in place, replacing `old` with `new`.

9. *Save Changes to a New File:*
   - `sed 's/old/new/' filename > newfile`: Save the modified content to a new file called `newfile`.

These are just some of the many capabilities of `sed`. It's a versatile tool for text manipulation in Unix environments. Be cautious when using `sed` with the `-i` option, as it modifies files directly without creating backups.
