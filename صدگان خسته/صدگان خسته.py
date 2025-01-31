a=input()
b=input()

if(int(a[2])>int(b[2])):
    print(b+" < "+a)
elif(int(a[2])<int(b[2])):
    print(a+" < "+b)
else:
    if(int(a[1])>int(b[1])):
        print(b+" < "+a)
    elif(int(a[1])<int(b[1])):
        print(a+" < "+b)
    else:
        if(int(a[0])>int(b[0])):
            print(b+" < "+a)
        elif(int(a[0])<int(b[0])):
            print(a+" < "+b)
        else:
            print(a+" = "+b)
