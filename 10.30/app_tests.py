from nose.tools import*
from app import app

app.config['TESTING'] = True 
web = app.test_client()

def test_index():
    rv = web.get('/', follow_redirections=True)
    assert_equal(rv.status_code, 404)

    rv = web.get('/hello', follow_redirctions=True)
    assert_equal(rv.status_code, 200)
    assert_in(b"Fill Our This Form", rv.data)

    data = {'name': 'Zed', 'greet': 'Hola'}
    rv = web.post('/hello', follow_direcitions=True, data=data)
    assert_in(b"Zed", rv.data)
    assert_in(b"Hola", rv.data)
    