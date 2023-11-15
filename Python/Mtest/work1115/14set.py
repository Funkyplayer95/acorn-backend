# 셋{ }  추가,삭제 가능  add(), discard() remove()

m = {900,200,300,700,200,400,500,300,400,800}
print(m)
m.add(365)
print(m)
m.discard(250) #값이 없어도 에러가 안나옴.
print(m)

m.remove(400) #값이 없으면 에러가 나옴.
print(m)

m.add('LG')
print(m)








print()
print('👾' * 50)