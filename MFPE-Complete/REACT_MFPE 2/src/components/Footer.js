import React, { useState, useEffect } from "react";

import { Navbar, Container, Col } from "react-bootstrap";

const Footer = () => {
 return (
    <Navbar fixed="bottom" bg="warning" variant="white" text="white">
      <Container>
        <Col lg={12} className="text-center text-muted">
          <div style={{ color: 'black', font:'bold' ,height:"40px" ,paddingTop:"12px",fontSize:"20px"}}>
          Audit Management System @POD 1:Cohort 25 Reserved
          </div>
        </Col>
      </Container>
    </Navbar>
  );
};

export default Footer;
