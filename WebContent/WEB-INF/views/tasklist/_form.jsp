<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<label for="title">Task</label><br />
<input type="text" name="title" id="title" value="${message.title}" />
<br /><br />

<input type="hidden" name="_token" value="${_token}" />
<button type="submit">Add</button>
