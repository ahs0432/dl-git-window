def factorial_re(n):
    if n==1:
        return 1
    return factorial_re(n-1) * n

fval = int(input("입력해주세요. > "))
print(factorial_re(fval))