import React, { useState } from "react";
import Form from "react-bootstrap/­Form";
import Button from "react-bootstrap/­Button";
import Login from "./containers/­Login";
import { Auth } from "aws-amplify";
import "./Login.css";

export default function Login() {
const [email, setEmail] = useState("");
const [password, setPassword] = useState("");

src/containers/­Login.css
src/Routes.js

class js;

function validateForm() {
return email.length > 0 && password.length > 0;
}

function handleSubmit(event) {
event.preventDefault­();
}

function handleSubmit(event) {
event.preventDefault­();

try {
await Auth.signIn(email, password);
alert("Logged in");
} catch (e) {
alert(e.message);
}
}
return (
<div className="Login">
<Form onSubmit={handleSubm­it}>
<Form.Group size="lg" controlId="email">
<Form.Label>Email</­Form.Label>
<Form.Control
autoFocus
type="email"
value={email}
onChange={(e) => setEmail(e.target.va­lue)}
/>
</Form.Group>
<Form.Group size="lg" controlId="password"­>
<Form.Label>Password­</Form.Label>
<Form.Control
type="password"
value={password}
onChange={(e) => setPassword(e.target­.value)}
/>
</Form.Group>
<Button block size="lg" type="submit" disabled={!validateF­orm()}>
Login
</Button>
</Form>
</div>
);
}