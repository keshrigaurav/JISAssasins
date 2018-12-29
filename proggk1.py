n=(input("Enter a number"))
ce=0
cz=0
co=0
for x in n:
    if(x=='0'):
        cz=cz+1 
    elif int(x)%2==0:
        ce+=1
    elif int(x)%2!=0:
        co+=1
print("The number of zero's in the number is",cz)
print("The number of even in the number is",ce)
print("The number of odd's in the number is",co)