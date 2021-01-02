def factorial_re(n):
    sum = 1
    if n==0:
        return sum
    sum = factorial_re(n-1)
    return sum * n

fval = int(input("입력해주세요. > "))
print(factorial_re(fval))