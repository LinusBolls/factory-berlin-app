import re

f = open("/users/linusbolls/door-opening-ble-cmd.txt", "r")

raw_hex = ""

for line in f.readlines():

    res = re.search('(?<=Value: )(.*)', line)

    if (res != None):
        raw_hex += res.group().replace("…", "").strip() + " "

decoded_hex = bytes.fromhex(raw_hex).decode('utf-8')

print(raw_hex)
print(decoded_hex)