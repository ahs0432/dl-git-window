a = lambda n: [1,0][n>1] or a(n-1)*n
fval = int(input("입력해주세요. > "))
print(a(fval))