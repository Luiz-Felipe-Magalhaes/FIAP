//retornando elementos pelo id 
//utilizando o getElementById()
const getId = document.getElementById('vingadores');
console.log(getId);
//utilizando o document.querySelector()
const queryId = document.querySelector('#vingadores')
console.log(queryId);
//retornando elementos pela class
//utilizando o getElementsByClassName()
const getClass = document.getElementsByClassName('nome');
console.log(getClass);
//utilizando o document.querySelectorAll()
const queryClass = document.querySelectorAll('.nome')
console.log(queryClass);
//retornando elementos pela tag
//utilizando o getElementsByTagName()
const getTag = document.getElementsByTagName('td');
console.log(getTag);
//utilizando o document.querySelectorAll()
const queryTag = document.querySelectorAll('td')
console.log(queryTag);
//pegando o elemento
console.log(queryTag[5]);
console.log(`${queryTag[5].textContent} será trocado pelo 
Homem Aranha`);
//alterando o nome
queryTag[5].textContent = 'Homem Aranha';

//recuperando o atributo na página HTML
const dataAtualizacao = document.querySelector('[data-JS]');
    //recuperando a data completa
    const dataAtual = new Date();
    //formatando a data
    const formataData = Intl.DateTimeFormat('pt-BR', {
        dateStyle: "long",
    });
    dataAtualizacao.textContent += 
    formataData.format(dataAtual);