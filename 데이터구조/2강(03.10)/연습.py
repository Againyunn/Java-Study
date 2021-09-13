def star():
    num=int(input("숫자를 입력하시오."))
    star="*"
    for j in range(num+1):
        result=star *j
        print(result)

if __name__=='__main__':
    star()