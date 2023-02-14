let div=document.createElement('div')
let p=document.createElement('p')
let h1=document.createElement('h1')
let span=document.createElement('span')

h1.innerText="bye"
span.innerText="bye"

h1.style.color="red"
span.style.color="red"

document.body.appendChild(div)
div.appendChild(p)
div.appendChild(h1)
document.body.appendChild(span)