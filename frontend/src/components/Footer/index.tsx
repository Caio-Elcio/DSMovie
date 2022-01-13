import './styles.css';

function Footer() {
    return (
        <>
            <footer>
                <div className="container-footer">
                    <div className="sec dsmovie">
                        <h5>DSMovie</h5>
                        <ul className="sci">
                            <li><a href="#"><i className="fa fa-whatsapp" aria-hidden="true"></i></a></li>
                            <li><a href="#"><i className="fa fa-instagram" aria-hidden="true"></i></a></li>
                            <li><a href="#"><i className="fa fa-facebook" aria-hidden="true"></i></a></li>
                            <li><a href="#"><i className="fa fa-twitter" aria-hidden="true"></i></a></li>
                            <li><a href="https://www.linkedin.com/in/caio-elcio-733426204" target="_blank">
                                <i className="fa fa-linkedin" aria-hidden="true"></i></a>
                            </li>
                            <li><a href="https://github.com/Caio-Elcio" target="_blank">
                                <i className="fa fa-github" aria-hidden="true"></i></a>
                            </li>
                        </ul>
                    </div>
                    <div className="sec localizacao">
                        <h5>Localização</h5>
                        <p><i className="fa fa-map-marker" aria-hidden="true"></i> Avenida Paulista, 12345 - Bela Vista, São
                            Paulo - SP, 01234-900
                        </p>
                    </div>
                    <div className="sec contato">
                        <h5>Contato</h5>
                        <ul className="info">
                            <li>
                                <p><i className="fa fa-phone" aria-hidden="true"></i>
                                    <a href="tel:5511941282899"> +55 (11) 94022-6090</a>
                                </p>
                            </li>
                            <li>
                                <p><i className="fa fa-phone" aria-hidden="true"></i>
                                    <a href="tel:5511953930508"> +55 (11) 94028-9060</a>
                                </p>
                            </li>
                            <li>
                                <p><i className="fa fa-envelope" aria-hidden="true"></i>
                                    <a href="mailto:dsmovie@gmail.com"> dsmovie@gmail.com</a>
                                </p>
                            </li>
                        </ul>
                    </div>
                </div>
            </footer>
            <div className="copyrightText">
                <p id="pFooter">Copyright © 2022 DSMovie. Todos os direitos reservados.</p>
            </div>
        </>
    );
}

export default Footer;