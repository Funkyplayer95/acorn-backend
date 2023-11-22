# 13emp.py문서

class Emp:
    title=''

    def __init__(self,title):
        print('생성자역할')
        self.title = title

    def display(self):
        print('제목=', self.title)
    
ob = Emp('봄여름')
ob.display()




print()
print()