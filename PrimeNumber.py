n = int(input("입력해주세요. > "))
isPrime = True

for k in range(2, n):
    if n % k == 0:
        isPrime = False
        break

if isPrime:
    print(n,"is prime number!")
else:
    print(n,"is not prime number!")