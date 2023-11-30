info = """우리나라 금수강산 대한민국 """
message = '''우리나라 금수강산 대한민국 '''

#https://www.crummy.com/software/BeautifulSoup/bs4/doc/#for-html-documents

from bs4 import BeautifulSoup

html_doc = """
"<html><head><title>The Dormouse's story</title></head>
<body>
<p class="title"><b>The Dormouse's story</b></p>

<p class="story">Once upon a time there were three little sisters; and their names were
<a href="http://example.com/elsie" class="sister" id="link1">Elsie</a>,
<a href="http://example.com/lacie" class="sister" id="link2">Lacie</a> and
<a href="http://example.com/tillie" class="sister" id="link3">Tillie</a>;
and they lived at the bottom of a well.</p>

<p class="story">...</p>
"""

soup = BeautifulSoup(html_doc, 'html.parser')
print(soup.prettify())
print()

print(soup.title)
print()

print(soup.title.name)
print()

print(soup.title.string)
print()

print(soup.title.parent.name)
print()

print(soup.p)
print()

print(soup.p['class'])
print()

print(soup.a)
print()

print(soup.find_all('a'))
print()

print(soup.get_text())
print()
print('-'  * 70)

soup = BeautifulSoup('<b class="boldest">Extremely bold</b>', 'html.parser')
tag = soup.b
print(tag)
print('타입 ', type(tag))
print(tag.name)

tag = BeautifulSoup('<b id="boldest">bold</b>', 'html.parser').b
print(tag['id']) #boldest
print(tag.attrs)
print()

tag['id'] = 'verybold'
tag['another-attribute'] = 1
print(tag)
print()

# del tag['id']
del tag['another-attribute']
print(tag)
print()
print(tag['id']) #에러발생
print(tag.get('id')) #None



print()
print('- ' * 100)