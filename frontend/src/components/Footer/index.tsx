import './styles.css';

function Footer() {
    return (
        <>
            <footer>
                <div className="container-footer">
                    <div className="sec dsmovie">
                        <h5>DSMovie</h5>
                        <p>
                            Lorem ipsum dolor sit amet consectetur, adipisicing elit.
                            Ad numquam minima repellendus ullam, praesentium unde fuga
                            sequi accusantium ex voluptas illum similique exercitationem expedita illo
                            officiis perspiciatis quod sit sunt.
                        </p>
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
                                <p><i className="fa fa-phone" aria-hidden="true"> +55 (11) 94022-6090</i></p>
                            </li>
                            <li>
                                <p><i className="fa fa-phone" aria-hidden="true"> +55 (11) 94028-9060</i></p>
                            </li>
                            <li>
                                <p><i className="fa fa-envelope" aria-hidden="true"> dsmovie@gmail.com</i></p>
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