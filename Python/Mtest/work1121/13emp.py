# 13emp.py문서

class Emp:
    title=''

    def __init__(self,title):
        print('생성자역할')
        self.title = title

    def display(self):
        print('display함수 ')
        print('제목=', self.title)

    def add(self,x, y):
        hap = x+y
        return hap
    
ob = Emp('수요일')
ob.display()
print(ob.add(90,85))






print()
print()