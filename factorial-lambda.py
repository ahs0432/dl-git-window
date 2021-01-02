a = lambda n: n*a(n-1) if n>1 else 1
fval = int(input("입력해주세요. > "))
print(a(fval))