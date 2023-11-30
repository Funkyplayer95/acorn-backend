import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys

options = webdriver.ChromeOptions()
options.add_experimental_option('excludeSwitches',['enable-logging'])
driver=webdriver.Chrome(options=options)
# driver.set_window_size(1920, 1280)

#04webdaum.py
url='https://www.daum.net'
# url='https://accounts.kakao.com/login/?continue=https%3A%2F%2Flogins.daum.net%2Faccounts%2Fksso.do%3Frescue%3Dtrue%26url%3Dhttps%253A%252F%252Fwww.daum.net#login'
driver.get(url)
time.sleep(1)

sel = driver.find_element(by=By.CSS_SELECTOR, value='#inner_login > a:nth-child(2)')
print(sel)
sel.click()

selA = driver.find_element(by=By.TAG_NAME, value='a')
print('selA =', selA.text)

eId = driver.find_element(by=By.ID, value='loginId--1')
eId.clear()
eId.send_keys('sky')
eId.send_keys(Keys.TAB)

ePwd = driver.find_element(by=By.ID, value='password--2')
ePwd.clear()
ePwd.send_keys('1234')
ePwd.send_keys(Keys.ENTER)

time.sleep(20)
print()
print('- ' * 100)

