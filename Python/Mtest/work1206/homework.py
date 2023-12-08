import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys

options = webdriver.ChromeOptions()
options.add_experimental_option('excludeSwitches',['enable-logging'])
driver=webdriver.Chrome(options=options)
# driver.set_window_size(1920, 1280)

#04webdaum.py
url='https://www.naver.com'
driver.get(url) # url 접속
time.sleep(1)

naverSearch = driver.find_element(by=By.CLASS_NAME, value='search_group')
search_input_box = naverSearch.find_element(by=By.CLASS_NAME, value='search_input_box')
driver.implicitly_wait(1)
search_input_box.click()
input = naverSearch.find_element(by=By.CLASS_NAME, value='search_input')
input.send_keys('삼성전자')
button = naverSearch.find_element(by=By.ID, value='search-btn')
button.click()
driver.implicitly_wait(1)

price = driver.find_element(by=By.CSS_SELECTOR, value='div.spt_tlt > h3 > a > span > strong').text

print('삼성전자 현 가격 : ',  price)



time.sleep(10)
print()
print('- ' * 100)

